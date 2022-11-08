package springbatch;

import org.springframework.batch.item.ItemProcessor;  

//Implementing the ItemProcessor interface 
public class CustomItemProcessor implements ItemProcessor {

	public Object process(Object item) throws Exception {
		System.out.println("processing item"+item);
		return null;
	}  




} 
