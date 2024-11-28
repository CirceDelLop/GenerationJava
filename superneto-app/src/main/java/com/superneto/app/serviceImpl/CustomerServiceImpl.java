package com.superneto.app.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import org.springframework.stereotype.Service;
import com.superneto.app.model.Customer;
import com.superneto.app.model.Role;
import com.superneto.app.repository.CustomerRepository;
import com.superneto.app.service.CustomerService;

/**La inyección de dependencias es un patrón de diseño que permite la creación de objetos y la gestión de sus dependencias de manera automática.
 * En lugar de crear los objetos directamente, la inyección de dependencias se encarga de proporcionar las dependencias necesarias a través de un contenedor de inversión de control.
 * La responsabilidad de crear y administrar los objetos se delega la contenedor de Spring.
 * @Component es una anotación genérica que se utiliza para indicar que la clase es componente de Spring y debe ser gestionada por el contenedor de inversión de control (IoC).
 * @Component se aplica a una clase para que Spring la detecte automáticamente y la registre como un bean en el contexto de la aplicación.
 * @Qualifer se usa para resolver ambiguedades cuando hay varios objetos(beans) del mismo tipo en el contexto de la aplicación y se necesita especificar el bean que se debe inyectar.
 * Bean: Es un objeto administrado por el contenedor de Spring.*/

@Service
public class CustomerServiceImpl implements CustomerService
{
	//@Autowired //Primer forma de inyección de dependencia
	CustomerRepository customerRepository;

	//Segunda forma de inyección de dependencia
	public CustomerServiceImpl(CustomerRepository customerRepository)
	{
		this.customerRepository=customerRepository;
	}
	
	@Override
	//Verificar si existe el email
	public Customer createCustomer(Customer customer)
	{
		Optional<Customer> optionalCustomer=customerRepository.findByEmail(customer.getEmail());
		if(optionalCustomer.isPresent())
		{
			throw new IllegalStateException("Customer already exist with email "+customer.getEmail());
		}
		
		//TODO Verificar si los atributos son válidos
		customer.setActive(true);//Se pone como activo el nuevo registro
		customer.setId(null);//Se forza la creación de un nuevo registro
		customer.setCreatedAt(LocalDateTime.now());
		Role customerRol=new Role();
		customerRol.setId(1L);
		customer.setRoles(Set.of(customerRol));
		Customer newCustomer=customerRepository.save(customer);
		return newCustomer;
	}

	@Override
	public Customer getCustomerById(Long id)
	{
		Optional<Customer> optionalCustomer=customerRepository.findById(id);
		if(optionalCustomer.isEmpty())//o .isPresent
		{
			throw new IllegalStateException("Custmer doesn't exist with id "+id);//Lanza una excepción
		}
		
		Customer existingCustomer=optionalCustomer.get();
		
		return existingCustomer;
	}

	@Override
	public Customer getCustomerByEmail(String email)
	{
		Optional<Customer> optionalCustomer=customerRepository.findByEmail(email);
		if(optionalCustomer.isEmpty())
		{
			throw new IllegalStateException("Customer doesn't exist with email "+email);
		}
		
		return optionalCustomer.get();
	}

	@Override
	public Set<Customer> getAllUsers(boolean isActive)
	{
		Set<Customer> customers;
		if(isActive)
		{
			customers=customerRepository.findAllByActiveTrue();
		}
		else
		{
			customers=customerRepository.findAllByActiveFalse();
		}
		return customers;
	}

	@Override
	public Customer updateCustomer(Customer customer, Long id)
	{
		//TODO verificar los nuevos atributos a cambiar
		Customer existingCustomer=getCustomerById(id);
		existingCustomer.setFirstName(customer.getFirstName());
		existingCustomer.setLastName(customer.getLastName());
		
		existingCustomer.setRoles( customer.getRoles() );
		return customerRepository.save(existingCustomer);
	}

	@Override
	public void deleteCustomer(Long id)
	{
		Customer existingCustomer=getCustomerById(id);
		//customerRepository.delete(existingCustomer);//Elimina de la BD
		//Cambia el estatus del atributo active a false
		existingCustomer.setActive(false);
		customerRepository.save(existingCustomer);
	}
}

/**Una excepción es una situación no esperada durante la ejecución de un programa. Existen dos tipos de excepciones.
 * A)Checked Exceptions: Son  excepciones que se heredan de la clase Exceptions. Se tiene que declarar la excepción en la firma del método o bien manejar la excepción con el bloque try-catch.
 * B)Unchecked Exceptions: Son excepciones que se heredan de la clase RuntimeException. No se está obligado a procesarlas.Es opcional el uso de try-catch o declar en la firma del método.
 * Las excepciones de Error, son arrojadas por la JVM, son errores
 * de los que no se pueden recuperar. Manejo de excepciones con el bloque try-catch.
 * Sintaxis:
 * 	try{Bloque de código}
 * 	catch(exception e){bloque de código}
 * 
 * try: bloque que contendrá sentencias que pudieran generar una excepción.
 * catch: se ejecutará si ocurre una excepción en try.
 * finally: se ejecutará después de try o catch.
 * El stacktrace de una excepción es el conjunto de mensajes desde el origen de la excepción hasta la última clase que recibe la excepción.*/
