package cloud.cholewa.tasklab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void shouldReturnTriangleArea() {
        var triangle = new Triangle(5, 6);

        assertEquals(15, triangle.getArea());
    }
}
