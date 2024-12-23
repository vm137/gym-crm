From the JPA 2.0 spec, the defaults are:
OneToOne: EAGER
OneToMany: LAZY
ManyToOne: EAGER
ManyToMany: LAZY


In Hibernate, all is Lazy
But in the latest versions of Hibernate it's aligning with the above JPA defaults.
