This PoC project is designed to answer some questions regarding how the PropertyPlaceholderConfigurer works.

? Can I use a ${variable} to specify which bean should be injected ?
? How do I inject the ApplicationContext into my bean ?


== Can I use a ${variable} to specify which bean should be injected ? ==
Yes. By defining <bean ... ref="${variable}"> you can specify the bean id of the bean to be injected in the properties file.

== How do I inject the ApplicationContext into my bean ? ==
Either use @Autowired or implement the ApplicationContextAware interface.


  