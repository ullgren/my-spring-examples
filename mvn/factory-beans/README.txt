This PoC project is designed to answer some questions regarding how the different ways Spring support the factory pattern works.

* How can I pass arguments into the factory-method ?
* When is FactoryBean#getObject() called ?
* Are the bean that the factory beans create passed through the BeanPostProcessors ?

== How can I pass arguments into the factory-method ? ==
When using the LegacySingelton or POJO Factory approach this can be done using the constructor-arg.

For factories implementing the FactoryBean interface there is no arguments to the factory method (getObject()).
However any specified consturctor-arg is passed to the constructor of the FactoryBean.

== When is FactoryBean#getObject() called ? ==
The getObject() method is called when the bean is retrieved from the application context.
If the method isSingelton() returns true this method will only be called once and then the application context will store the returned object.

== Are the bean that the factory beans create passed through the BeanPostProcessors ? ==
Yes. After getObject() has been called on the FactoryBean the returned object is passed to the BeanPostProcessors#postProcessAfterInitialization(...)


