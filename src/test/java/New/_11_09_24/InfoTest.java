package New._11_09_24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class InfoTest {
    private final static Info info = new Info();

    @BeforeEach
    public void setUp() {
        InfoLogger.log.clear();
    }

    @Test
    void getInfoLoggerTest() {
        Employee employee = Mockito.mock(Employee.class);

        when(employee.getRole()).thenReturn(Role.valueOf("LEVEL_CEO"));

        info.getInfo(employee);
        assertEquals(1, InfoLogger.log.size());
    }
}