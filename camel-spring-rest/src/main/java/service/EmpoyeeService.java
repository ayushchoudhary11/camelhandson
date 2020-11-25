package service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class EmpoyeeService {
	@Autowired
private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

@Bean
public SqlComponent getSqlComponent() {
SqlComponent sql=new SqlComponent();
sql.setDataSource(dataSource);
return sql;

@Override
public void configure() throws Exception{
	from("direct:insert").log("Message is not being processed").setHeader("message",body()).process(new Processor()){
		
	
	
	
	}
	
	


	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
