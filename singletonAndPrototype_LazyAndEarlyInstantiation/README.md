# Meaning of Singleton in Spring
1. Spring creates a singleton bean when it loads the context and assigns the bean a name
(sometimes also referred to as bean ID).

2. if you know what singleton pattern is, the way it works in Spring might look strange to
   you because you have only one instance of a type in the app. For Spring, the singleton
   concept allows multiple instances of the same type, and singleton means unique per name
   but not unique per app.

# Using beans boils down to three points
- Make an object bean in the Spring context only if you need Spring to manage it so that the framework can augment that bean with a
specific capability. If the object doesn’t need any capability offered by the framework, you don’t need to make it a bean.
- If you need to make an object bean in the Spring context, it should be singleton only if it’s immutable. Avoid designing mutable
singleton beans.
- If a bean needs to be mutable, an option could be to use the prototype scope

# Using earger and lazr instantiation
- In most cases, Spring creates all singleton beans when it initializes the context—this is
  Spring’s default behavior is eager.
## When should you use eager instantiation and when should you use lazy?
### Eager
- In a lazy instantiation, the framework has to first check if the instance exists and eventually
  create it if it doesn’t, so from the performance point of view, it’s better to have the
  instances in the context already (eager) because it spares some checks the framework
  needs to do when one bean delegates to another. Another advantage of eager instantiation
  is when something is wrong and the framework cannot create a bean; we can observe this
  issue when starting the app. With lazy instantiation, someone would observe the issue only
  when the app is already executing and it reaches the point that the bean needs to be
  created.
### Lazy
- But lazy instantiation is not all evil. Some time ago, I worked on a vast monolithic
  application. This app was installed in different locations where it was used in various scopes
  by its clients. In most cases, a specific client didn’t use a big part of the functionality, so
  instantiating the beans together with the Spring context unnecessarily occupied a lot of
  memory. For that app, the developers designed most of the beans to be lazily instantiated
  so that the app would create only the necessary instances.

| Singleton Scope | Prototype Scope |
| :--- | :--- |
| • Framework associates a name with an **actual object instance**<br>• Every reference returns the **exact same instance**<br>• Creation can happen on **context startup** (eager) or **first request** (lazy)<br>• **Default** bean scope in Spring<br>• **Not recommended** to have mutable attributes (thread-safety risk) | • Framework associates a name with a **type**<br>• Every reference returns a **brand-new instance**<br>• Creation **only occurs on-demand** when explicitly referenced<br>• Must be **explicitly declared** (`@Scope("prototype")`)<br>• Safe to maintain **mutable state** per instance |
