package com.uneversity.Departments.format;

import com.uneversity.Departments.lectors.model.LectorDTO;
import org.springframework.shell.table.ArrayTableModel;
import org.springframework.shell.table.BorderStyle;
import org.springframework.shell.table.TableBuilder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class OutputFormatter {

    public String coverToTable(List<LectorDTO> customers) {
        var data = new ArrayList<>(customers
                .stream()
                .map(OutputFormatter::toRow)
                .toList());
        data.add(0, addRow("id", "email", "firstName", "lastName", "salary", "departmentId", "academicDegree"));

        ArrayTableModel model = new ArrayTableModel(
                data.toArray(new Object[0][]));
        TableBuilder table = new TableBuilder(model);
        table.addHeaderAndVerticalsBorders(BorderStyle.fancy_light);
        return table.build().render(100);
    }


    private static String[] toRow(LectorDTO c) {

        return addRow(String.valueOf(c.getId()),
                c.getEmail(),
                c.getFirstName(),
                c.getLastName(),
                String.valueOf(c.getSalary()),
                String.valueOf(c.getDepartmentId()),
                String.valueOf(c.getDegree()));
    }

    private static String[] addRow(String... values) {
        return values;
    }

}
