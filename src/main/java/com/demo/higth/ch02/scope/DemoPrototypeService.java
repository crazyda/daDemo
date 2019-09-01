package com.demo.higth.ch02.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")// ÉùÃ÷Scope 
public class DemoPrototypeService {

}
