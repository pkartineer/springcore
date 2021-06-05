package com.pk.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/pk/springcore/spel/config.xml");
        Demo demo = context.getBean("demo", Demo.class);
        System.out.println(demo);

        //SPEL using class
        //But mostly it not use
        SpelExpressionParser spelExpressionParser = new SpelExpressionParser();
        Expression expression = spelExpressionParser.parseExpression("{20+40}");
        System.out.println(expression.getValue());

    }
}
