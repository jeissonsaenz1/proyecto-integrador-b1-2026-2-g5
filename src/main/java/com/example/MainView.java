package com.example;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.TabSheet;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Proyecto Integrador")
@Route("")
public class MainView extends VerticalLayout {

    public MainView() {

        setSizeFull();
        setPadding(true);
        setSpacing(true);

        H2 titulo = new H2("Proyecto Integrador - Gestión de Farmacia");

        TabSheet tabSheet = new TabSheet();
        tabSheet.setWidthFull();

        tabSheet.add("Detalle Venta", crearDetalleVenta());
        tabSheet.add("Venta", crearVenta());
        tabSheet.add("Inventario", crearInventario());
        tabSheet.add("Medicamento", crearMedicamento());
        tabSheet.add("Laboratorio", crearLaboratorio());
        tabSheet.add("Fórmula", crearFormula());
        tabSheet.add("Fórmula Medicamento", crearFormulaMedicamento());

        add(titulo, tabSheet);
    }

    private Component crearDetalleVenta() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField id = new TextField("ID");
        TextField fechaActualizacion = new TextField("Fecha actualización");
        TextField fechaCreacion = new TextField("Fecha creación");
        TextField cantidad = new TextField("Cantidad");
        TextField subtotal = new TextField("Subtotal");
        TextField medicamentoId = new TextField("Medicamento ID");
        TextField ventaId = new TextField("Venta ID");
        TextField estadoActivo = new TextField("Estado activo");

        FormLayout form = new FormLayout(
                id,
                fechaActualizacion,
                fechaCreacion,
                cantidad,
                subtotal,
                medicamentoId,
                ventaId,
                estadoActivo
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Detalle de venta preparado")
        );
        guardar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button limpiar = new Button("Limpiar", event -> {
            id.clear();
            fechaActualizacion.clear();
            fechaCreacion.clear();
            cantidad.clear();
            subtotal.clear();
            medicamentoId.clear();
            ventaId.clear();
            estadoActivo.clear();
        });

        HorizontalLayout acciones = new HorizontalLayout(guardar, limpiar);

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID");
        grid.addColumn(row -> row[1]).setHeader("Cantidad");
        grid.addColumn(row -> row[2]).setHeader("Subtotal");
        grid.addColumn(row -> row[3]).setHeader("Medicamento ID");
        grid.addColumn(row -> row[4]).setHeader("Venta ID");
        grid.addColumn(row -> row[5]).setHeader("Estado activo");

        layout.add(form, acciones, grid);

        return layout;
    }

    private Component crearVenta() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField id = new TextField("ID");
        TextField fechaActualizacion = new TextField("Fecha actualización");
        TextField fechaCreacion = new TextField("Fecha creación");
        TextField estado = new TextField("Estado");
        TextField total = new TextField("Total");
        TextField estadoActivo = new TextField("Estado activo");

        FormLayout form = new FormLayout(
                id,
                fechaActualizacion,
                fechaCreacion,
                estado,
                total,
                estadoActivo
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Venta preparada")
        );
        guardar.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        Button limpiar = new Button("Limpiar", event -> {
            id.clear();
            fechaActualizacion.clear();
            fechaCreacion.clear();
            estado.clear();
            total.clear();
            estadoActivo.clear();
        });

        Grid<String[]> grid = new Grid<>();
        grid.addColumn(row -> row[0]).setHeader("ID");
        grid.addColumn(row -> row[1]).setHeader("Estado");
        grid.addColumn(row -> row[2]).setHeader("Total");
        grid.addColumn(row -> row[3]).setHeader("Estado activo");

        layout.add(form, new HorizontalLayout(guardar, limpiar), grid);

        return layout;
    }

    private Component crearInventario() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField id = new TextField("ID");
        TextField fechaActualizacion = new TextField("Fecha actualización");
        TextField fechaCreacion = new TextField("Fecha creación");
        TextField fechaVencimiento = new TextField("Fecha vencimiento");
        TextField lote = new TextField("Lote");
        TextField stock = new TextField("Stock");
        TextField medicamentoId = new TextField("Medicamento ID");
        TextField estadoActivo = new TextField("Estado activo");

        FormLayout form = new FormLayout(
                id,
                fechaActualizacion,
                fechaCreacion,
                fechaVencimiento,
                lote,
                stock,
                medicamentoId,
                estadoActivo
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Inventario preparado")
        );

        Button limpiar = new Button("Limpiar", event -> {
            id.clear();
            fechaActualizacion.clear();
            fechaCreacion.clear();
            fechaVencimiento.clear();
            lote.clear();
            stock.clear();
            medicamentoId.clear();
            estadoActivo.clear();
        });

        layout.add(
                form,
                new HorizontalLayout(guardar, limpiar)
        );

        return layout;
    }

    private Component crearMedicamento() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField id = new TextField("ID");
        TextField fechaActualizacion = new TextField("Fecha actualización");
        TextField fechaCreacion = new TextField("Fecha creación");
        TextField nombre = new TextField("Nombre");
        TextField laboratorioId = new TextField("Laboratorio ID");
        TextField estadoActivo = new TextField("Estado activo");

        FormLayout form = new FormLayout(
                id,
                fechaActualizacion,
                fechaCreacion,
                nombre,
                laboratorioId,
                estadoActivo
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Medicamento preparado")
        );

        Button limpiar = new Button("Limpiar", event -> {
            id.clear();
            fechaActualizacion.clear();
            fechaCreacion.clear();
            nombre.clear();
            laboratorioId.clear();
            estadoActivo.clear();
        });

        layout.add(
                form,
                new HorizontalLayout(guardar, limpiar)
        );

        return layout;
    }

    private Component crearLaboratorio() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField id = new TextField("ID");
        TextField fechaActualizacion = new TextField("Fecha actualización");
        TextField fechaCreacion = new TextField("Fecha creación");
        TextField calle = new TextField("Calle");
        TextField ciudad = new TextField("Ciudad");
        TextField pais = new TextField("País");
        TextField nombre = new TextField("Nombre");
        TextField estadoActivo = new TextField("Estado activo");

        FormLayout form = new FormLayout(
                id,
                fechaActualizacion,
                fechaCreacion,
                calle,
                ciudad,
                pais,
                nombre,
                estadoActivo
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Laboratorio preparado")
        );

        Button limpiar = new Button("Limpiar", event -> {
            id.clear();
            fechaActualizacion.clear();
            fechaCreacion.clear();
            calle.clear();
            ciudad.clear();
            pais.clear();
            nombre.clear();
            estadoActivo.clear();
        });

        layout.add(
                form,
                new HorizontalLayout(guardar, limpiar)
        );

        return layout;
    }

    private Component crearFormula() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField id = new TextField("ID");
        TextField fechaActualizacion = new TextField("Fecha actualización");
        TextField fechaCreacion = new TextField("Fecha creación");
        TextField nombre = new TextField("Nombre");
        TextField estadoActivo = new TextField("Estado activo");

        FormLayout form = new FormLayout(
                id,
                fechaActualizacion,
                fechaCreacion,
                nombre,
                estadoActivo
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Fórmula preparada")
        );

        Button limpiar = new Button("Limpiar", event -> {
            id.clear();
            fechaActualizacion.clear();
            fechaCreacion.clear();
            nombre.clear();
            estadoActivo.clear();
        });

        layout.add(
                form,
                new HorizontalLayout(guardar, limpiar)
        );

        return layout;
    }

    private Component crearFormulaMedicamento() {

        VerticalLayout layout = new VerticalLayout();
        layout.setPadding(false);

        TextField formulaId = new TextField("Fórmula ID");
        TextField medicamentoId = new TextField("Medicamento ID");

        FormLayout form = new FormLayout(
                formulaId,
                medicamentoId
        );

        Button guardar = new Button("Guardar", event ->
                Notification.show("Relación fórmula-medicamento preparada")
        );

        Button limpiar = new Button("Limpiar", event -> {
            formulaId.clear();
            medicamentoId.clear();
        });

        layout.add(
                form,
                new HorizontalLayout(guardar, limpiar)
        );

        return layout;
    }
}