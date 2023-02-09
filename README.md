# materialicons-flow
Material Icons for Vaadin Flow 14+.

It contains 1800+ icons, based on  [Iron Icon Vaadin addon](https://vaadin.com/directory/component/iron-icons/links).

It integrates the [materialicons](https://github.com/gl0b3/materialicons) web component (Javascript / Polymer) and allows us to use it in Vaadin Flow (Java).

## Install

Add the `materialicons-flow` dependency to your `pom.xml`:
```xml
<dependency>
   <groupId>org.vaadin.addons.gl0b3</groupId>
   <artifactId>materialicons-flow</artifactId>
   <version>1.0.0</version>
</dependency>
```

Add the `vaadin-addons` repository to your `pom.xml` so Maven will be able to download the dependency:
```xml
<repository>
   <id>vaadin-addons</id>
   <url>http://maven.vaadin.com/vaadin-addons</url>
</repository>
```

## Basic Usage

Create a `refresh` MaterialIcon (it extends the IronIcon)
```java
MaterialIcon refreshIcon = MaterialIcons.REFRESH.create();
```



