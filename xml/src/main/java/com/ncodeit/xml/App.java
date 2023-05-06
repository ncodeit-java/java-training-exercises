package com.ncodeit.xml;

import java.io.StringWriter;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws JAXBException
    {
    	
    	Person p=new Person();
    	p.setFirstName("p1");
    	p.setLastName("p2");
    	
    	Address ad1=new Address();
    	ad1.setCity("Hyd");
    	ad1.setState("Telangana");
    	
    	Address ad2=new Address();
    	ad2.setCity("Pune");
    	ad2.setState("Maharastra");
    	
    	p.setAddresses(Arrays.asList(ad1,ad2));
    	
        // create JAXB context and instantiate marshaller
        JAXBContext context = JAXBContext.newInstance(Person.class);
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

        // Write to System.out
       // m.marshal(p, System.out);
        
        StringWriter sw=new StringWriter();
        m.marshal(p, sw);
        String xmlString=sw.toString();
        System.out.println(xmlString);
    }
}
