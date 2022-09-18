package task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;


public class Schedule {
    private Map<Subject, List<LocalDate>> mapSubjectDates;

    public Schedule() {
    }

    public Schedule(final Map<Subject, List<LocalDate>> mapSubjectDates) {
        this.mapSubjectDates = mapSubjectDates;
    }

    public Map<Subject, List<LocalDate>> getMapSubjectDates() {
        return mapSubjectDates;
    }

    public void setMapSubjectDates(final Map<Subject, List<LocalDate>> mapSubjectDates) {
        this.mapSubjectDates = mapSubjectDates;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Schedule schedule = (Schedule) o;
        return mapSubjectDates.equals(schedule.mapSubjectDates);
    }

}