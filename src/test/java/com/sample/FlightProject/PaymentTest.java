package com.sample.FlightProject;
import org.junit.Assert;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.Dao.PaymentService;
import com.model.Payment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
class PaymentTest {
	@Autowired
	PaymentService service;
	@Test
	void testAdd() {
		Payment payment=new Payment();
		payment.setAmount(50000.0);
		service.addPayment(payment);
		Payment payment1=service.find(payment.getId());
			Assert.assertEquals(50000.0,payment1.getAmount());
	}
	@Test
	void testFind() {
		Payment p=new Payment();
		p.setAmount(50000.0);
		Payment p1=service.find(p.getId());
		Assert.assertNull(p1);
	}
	@Test
	void testFindAll() {
		Payment p1=new Payment();
		p1.setAmount(60000);
		service.addPayment(p1);
		Payment l=new Payment();
		l.setAmount(60000.0);
		service.addPayment(l);
	List<Payment>paymentlist=service.findAll();
	Assert.assertEquals(paymentlist.get(1).getAmount(), 60000.0);
	

}
	
	@Test 
	void testDelete() {
		Payment u1 = service.find(5);
		service.deletePayment(u1.getId());
//		if(u1!=null) {
//			System.out.println("****Not deleted****");
//			
//		}
		Payment u2=service.find(5);
		Assert.assertNull(u2);
	}

}
