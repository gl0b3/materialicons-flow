# materialicons-flow
Material Icons for Vaadin Flow 23.

Source on GitHub: [materialicons-flow](https://github.com/gl0b3/materialicons-flow)

It contains 1800+ icons, based on  [Vaadin Icon](https://vaadin.com/docs/latest/components/icons).

It integrates the [materialicons](https://github.com/gl0b3/materialicons) web component (Javascript / Polymer) and allows us to use it in Vaadin Flow (Java).

## Note

If you previously used materialicons-flow version 1.0.0, please switch to 1.0.1. Version materialicons (Javascript) 1.0.0 has been removed from the NPMJS registry and replaced by 1.0.1. The code remained the same, only the version number changed due to the republishing.

If you previously used materialicons-flow version 2.0.0, please switch to 2.0.1. Version materialicons (Javascript) 2.0.1 has been removed from the NPMJS registry and replaced by 2.0.2. The code remained the same, only the version number changed due to the republishing.

| materialicons-flow (Java Maven artifact) | materialicons (NPM/Javascript module) | NPMJS registry Status |
|------------------------------------------|---------------------------------------|-----------------------|
| 1.0.0 (for Vaadin 14+)                   | 1.0.0                                 | unavailable           |
| 1.0.1 (for Vaadin 14+)                   | 1.0.1                                 | available             |
| 2.0.0 (for Vaadin 23)                    | 2.0.0 & 2.0.1                         | unavailable           |
| 2.0.1 (for Vaadin 23)                    | 2.0.2                                 | available             |
| 3.0.0 (for Vaadin 24.4+)                 | 3.0.2                                 | available             |

## Install

Add the `materialicons-flow` dependency to your `pom.xml`:
```xml
<dependency>
   <groupId>org.vaadin.addons.gl0b3</groupId>
   <artifactId>materialicons-flow</artifactId>
   <version>2.0.1</version>
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

## Branch information
* `main` the latest version for Vaadin 23
* `1.0.1` the version for Vaadin 14+ (LTS)
* `2.0.2` the version for Vaadin 23
* `3.0.0` the version for Vaadin 24.4+

## Running demos locally

1. Fork the `materialicons-flow` repository and clone it locally.
2. Build the project: `mvn clean install`
3. Start the test/demo server: `mvn jetty:run`
4. Navigate to http://localhost:8080 to view the demo.



