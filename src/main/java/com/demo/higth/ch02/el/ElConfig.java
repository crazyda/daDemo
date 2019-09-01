package com.demo.higth.ch02.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan("com.demo.higth.ch02.el")
@PropertySource("classpath:com/demo/higth/ch02/el/test.properties")
public class ElConfig {
	
	@Value("I Love You!") //  ע����ͨ�ַ���
    private String normal;

	@Value("#{systemProperties['os.name']}") //2 ע�����ϵͳ����
	private String osName;
	
	@Value("#{ T(java.lang.Math).random() * 100.0 }") //3  ע����ʽ���
    private double randomNumber;

	@Value("#{demoService.another}") //4 ע������Bean ����
	private String fromAnother;

	@Value("classpath:com/demo/higth/ch02/el/test.txt") //5  ע���ļ���Դ
	private Resource testFile;

	@Value("http://www.baidu.com") //6   ע����ҳ��Դ
	private Resource testUrl;

	@Value("${book.name}") //7  ע�������ļ�
	private String bookName;

	@Autowired
	private Environment environment; //7
	
	@Bean //7
	public static PropertySourcesPlaceholderConfigurer propertyConfigure() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	public void outputResource() {
		try {
			System.out.println(normal);
			System.out.println(osName);
			System.out.println(randomNumber);
			System.out.println(fromAnother);
			
			System.out.println(IOUtils.toString(testFile.getInputStream()));
			System.out.println(IOUtils.toString(testUrl.getInputStream()));
			System.out.println(bookName);
			System.out.println(environment.getProperty("book.author"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
