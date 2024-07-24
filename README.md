# materialicons-flow
Material Icons for Vaadin Flow 24.4.x.

Source on GitHub: [materialicons-flow](https://github.com/gl0b3/materialicons-flow)

It contains 1800+ icons, based on  [Vaadin Icon](https://vaadin.com/docs/latest/components/icons).

It integrates the [materialicons](https://github.com/gl0b3/materialicons) web component (Javascript / Lit) and allows us to use it in Vaadin Flow (Java).

## Install

Add the `materialicons-flow` dependency to your `pom.xml`:
```xml
<dependency>
   <groupId>org.vaadin.addons.gl0b3</groupId>
   <artifactId>materialicons-flow</artifactId>
   <version>3.0.0</version>
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

Create a `refresh` MaterialIcon (it extends the VaadinIcon)
```java
Icon refreshIcon = MaterialIcons.REFRESH.create();
```
or inplace i.e. for button's icon:
```java
Button refreshButton = new Button(MaterialIcons.REFRESH.create());
```

## Version information
* 1.x.x. - the version for Vaadin 14+
* 2.x.x. - the version for Vaadin 23
* 3.x.x. - the version for Vaadin 24

## Branch information
* `main` the latest version for Vaadin 24
* `1.0.0` the version for Vaadin 14+ (LTS)
* `2.0.0` the version for Vaadin 23
* `3.0.0` the version for Vaadin 24

## Running demos locally

1. Fork the `materialicons-flow` repository and clone it locally.
2. Build the project: `mvn clean install`
3. Start the test/demo server: `mvn jetty:run` - this not work properly, bugfix needed
4. Navigate to http://localhost:8080 to view the demo. - this not work properly, bugfix needed



