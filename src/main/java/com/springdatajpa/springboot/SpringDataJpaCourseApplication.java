package com.springdatajpa.springboot;

import com.springdatajpa.springboot.entity.*;
import com.springdatajpa.springboot.repository.CategoryRepository;
import com.springdatajpa.springboot.repository.ProductRepository;
import com.springdatajpa.springboot.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class SpringDataJpaCourseApplication  implements CommandLineRunner{

//	@Autowired
//	private StudentRepository studentRepository;


	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;



	private static final Logger log = LoggerFactory.getLogger(SpringDataJpaCourseApplication.class);

	public static void main(String[] args) {



		SpringApplication.run(SpringDataJpaCourseApplication.class, args);



	}

	@Override
	public void run(String... args) throws Exception {


//		Student student = new Student();
//		student.setStudentName("Sabur");
//		student.setStudentId(4);
//		student.setAbout("I am Student");
//
//
//
//       Laptop laptop = new Laptop();
//		laptop.setLaptopId(1);
//		laptop.setModelNumber("12345");
//		laptop.setBrand("Aces");
//		laptop.setStudent(student);
//
//		student.setLaptop(laptop);
//
//		Student save = studentRepository.save(student);
//
//		log.info("saved student : {}", save.getStudentName());


//		Student student = new Student();
//		student.setStudentName("Sabur Rizvi");
//		student.setStudentId(4);
//		student.setAbout("I am Student");
//
//		Address a1 = new Address();
//		a1.setAddressId(123);
//		a1.setStreet("235/2");
//		a1.setCity("Chicago");
//		a1.setCountry("USA");
//		a1.setStudent(student);
//
//
//		Address a2 = new Address();
//		a2.setAddressId(456);
//		a2.setStreet("654/45");
//		a2.setCity("New Mexico");
//		a2.setCountry("Mexico");
//		a2.setStudent(student);
//
//		List<Address> addressList = new ArrayList<>();
//		addressList.add(a1);
//		addressList.add(a2);
//
//		student.setAddressList(addressList);
//
//		Student save = studentRepository.save(student);
//
//		log.info("Student created  :  with address");


//		Product product1 = new Product();
//
//		product1.setPId(1);
//		product1.setProductName("IPhone 15 max pro");
//
//		Product product2 = new Product();
//
//		product2.setPId(2);
//		product2.setProductName("Samsung s22 Ultra");
//
//		Product product3 = new Product();
//
//		product3.setPId(3);
//		product3.setProductName("Samsung TV 12345");
//
//
//		Category category1 = new Category();
//
//		category1.setCId(1);
//		category1.setTitle("Electronics");
//
//		Category category2 = new Category();
//
//		category2.setCId(2);
//		category2.setTitle("Mobile Phones");
//
//		//  make some categories of products
//
//		List<Product> category1Products = category1.getProducts();
//		category1Products.add(product1);
//		category1Products.add(product2);
//		category1Products.add(product3);
//
//		List<Product> category2Products = category2.getProducts();
//		category2Products.add(product1);
//		category2Products.add(product2);
//
//		categoryRepository.save(category1);
//		categoryRepository.save(category2);
	//	productRepository.save(product1);
	//	productRepository.save(product2);
	//	productRepository.save(product3);


		Category category = categoryRepository.findById(1).get();
//		System.out.println(category.getProducts().size());
//
//
//		Category category1 = categoryRepository.findById(2).get();
//		System.out.println(category1.getProducts().size());

		Product product = productRepository.findById(1).get();
		System.out.println(product.getCategories().size());


	}



}
