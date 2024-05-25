package task_3_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Iterator;


public class StaffListIterator implements Iterator<Employee> {

    private List<Employee> sortedEmployees;
    private int currentIndex;

    public StaffListIterator(List<Employee> employees) {
        // Копируем список сотрудников и сортируем его по алфавиту
        this.sortedEmployees = new ArrayList<>(employees);
        Collections.sort(sortedEmployees, Comparator.comparing(Employee::getName));
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < sortedEmployees.size();
    }

    @Override
    public Employee next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more employees in the list");
        }
        return sortedEmployees.get(currentIndex++);
    }
}
