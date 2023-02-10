package org.vaadin.addons.gl0b3.materialicons;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.html.Pre;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

/**
 * Test View for our {@link MaterialIcons} add-on class. It shows all the Material icons
 * This class and others in the test folder will not be included in the final JAR.
 */
@Route("")
@CssImport(value = "./styles/materialicons-flow-test-styles.css")
public class TestView extends VerticalLayout {

	public TestView() {
		setSizeFull();

		add(new H2("Material Icons for Vaadin Flow v23"));

		HorizontalLayout usage1Layout = new HorizontalLayout();
		usage1Layout.setAlignItems(Alignment.CENTER);
		usage1Layout.add(new Label("Usage to make i.e. a refresh icon:"));
		Pre refreshIconLabel = new Pre("MaterialIcon refreshIcon = MaterialIcons.REFRESH.create();");
		usage1Layout.add(refreshIconLabel);
		usage1Layout.add(MaterialIcons.REFRESH.create());
		add(usage1Layout);

		HorizontalLayout usage2Layout = new HorizontalLayout();
		usage2Layout.setAlignItems(Alignment.CENTER);
		usage2Layout.add(new Label("or inplace i.e. for button's icon:"));
		Pre refreshButtonLabel = new Pre("Button refreshButton = new Button(MaterialIcons.REFRESH.create());");
		usage2Layout.add(refreshButtonLabel);
		usage2Layout.add(new Button("Refresh", MaterialIcons.REFRESH.create()));
		add(usage2Layout);

		Div contentDiv = new Div();
		contentDiv.setWidthFull();

		List<String> names = new ArrayList<>();
		for ( MaterialIcons icon : MaterialIcons.values() ) {
			Span contentSpan = new Span();
			contentSpan.setClassName("container");
			contentSpan.add(icon.create());
			Div iconNameDiv = new Div();
			iconNameDiv.getElement().setText(MaterialIcons.ICONSET + ":" + icon.name());
			contentSpan.add(iconNameDiv);
			contentDiv.add(contentSpan);
		}

		addAndExpand(contentDiv);
	}

}
