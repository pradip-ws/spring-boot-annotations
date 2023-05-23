package learning.springboot.springbootannotations;

import learning.springboot.springbootannotations.controller.MyController;
import learning.springboot.springbootannotations.controller.PizzaController;
import learning.springboot.springbootannotations.lazy.LazyLoader;
import learning.springboot.springbootannotations.propertysource.PropertySourceDemo;
import learning.springboot.springbootannotations.repository.MyRepository;
import learning.springboot.springbootannotations.scope.PrototypeBean;
import learning.springboot.springbootannotations.scope.SingletonBean;
import learning.springboot.springbootannotations.service.MyService;
import learning.springboot.springbootannotations.service.VegPizza;
import learning.springboot.springbootannotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SpringBootAnnotationsApplication.class, args);

//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		System.out.println(pizzaController.getPizza());
//
//		PizzaController pizzaControllerByName = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaControllerByName.getPizza());

//		VegPizza vegPizza =context.getBean(VegPizza.class);
//		System.out.printf(vegPizza.getPizza());

//		MyController myController= (MyController) context.getBean("myController");
//		System.out.println(myController.hello());

//		MyService  myService = (MyService) context.getBean("myService");
//		System.out.println(myService.hello());

//		MyRepository myRepository = context.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//		LazyLoader lazyLoader = context.getBean(LazyLoader.class);

//		SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean1.hashCode());
//		SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean2.hashCode());
//		SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
//		System.out.println(singletonBean3.hashCode());
//
//
//		PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean1.hashCode());
//		PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean2.hashCode());
//		PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
//		System.out.println(prototypeBean3.hashCode());

//		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//		System.out.println(valueAnnotationDemo.getDefaultName());
//		System.out.println(valueAnnotationDemo.getHost());
//		System.out.println(valueAnnotationDemo.getEmail());
//		System.out.println(valueAnnotationDemo.getPassword());
//		System.out.println(valueAnnotationDemo.getHomeDir());
//		System.out.println(valueAnnotationDemo.getJavaHome());

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getPassword());
		System.out.println(propertySourceDemo.getAppName());
		System.out.println(propertySourceDemo.getAppDescription());}

}
