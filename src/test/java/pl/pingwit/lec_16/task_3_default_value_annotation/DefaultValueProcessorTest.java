package pl.pingwit.lec_16.task_3_default_value_annotation;

import org.junit.jupiter.api.Test;
import pl.pingwit.lec_16.CustomerDetails;
import java.time.LocalDate;
import static org.assertj.core.api.Assertions.assertThat;

class DefaultValueProcessorTest {
    DefaultValueProcessor target = new DefaultValueProcessor(); //private

    @Test
    void shouldSetNowWhenLocalDateIsNull() throws IllegalAccessException {
        //given
        CustomerDetails customerDetailsWithNullDate = new CustomerDetails("test", "test", "test", "test", null, 1);
        CustomerDetails expected = new CustomerDetails("test", "test", "test", "test", LocalDate.now(), 1); // FYI: если я запущу этот тест в полночь, то рано или поздно он упадет из-за LocalDate.now
        //when
        target.process(customerDetailsWithNullDate);
        //then
        assertThat(customerDetailsWithNullDate).isEqualTo(expected);
    }

    @Test
    void shouldSetDefaultValueWhenStringsIsNull() throws IllegalAccessException {
        //given
        CustomerDetails customerDetailsWithNullStrings = new CustomerDetails(null, null, null, null, LocalDate.of(1993, 12, 7), 1);
        CustomerDetails expected = new CustomerDetails("defaultValue", "defaultValue", "defaultValue", "defaultValue", LocalDate.of(1993, 12, 7), 1);
        //when
        target.process(customerDetailsWithNullStrings);
        //then
        assertThat(customerDetailsWithNullStrings).isEqualTo(expected);
    }

    @Test
    void shouldSetDefaultValueWhenIntegerIsNull() throws IllegalAccessException {
        //given
        CustomerDetails customerDetailsWithNullStrings = new CustomerDetails("test", "test", "test", "test", LocalDate.of(1993, 12, 7), null);
        CustomerDetails expected = new CustomerDetails("test", "test", "test", "test", LocalDate.of(1993, 12, 7), 0);
        //when
        target.process(customerDetailsWithNullStrings);
        //then
        assertThat(customerDetailsWithNullStrings).isEqualTo(expected);
    }

    // если тест не нужен, то удаляй сразу
   /* @Test
    void shouldThrowExceptionWhenStringIsEmpty(){
        //given
        CustomerDetails customerDetailsWithEmptyStrings = new CustomerDetails("", "", "", "", LocalDate.of(1993, 12, 7), 1);
        //when
        IllegalAccessException illegalAccessException = assertThrows(IllegalAccessException.class, () -> target.process(customerDetailsWithEmptyStrings));
        //then
        assertThat(illegalAccessException.getMessage()).isEqualTo("String is blank");
    }*/
}