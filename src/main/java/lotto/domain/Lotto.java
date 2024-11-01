package lotto.domain;

import java.util.List;

import static lotto.constant.ConstantError.IS_DUPLICATE;
import static lotto.constant.ConstantError.NOT_SIX_NUMBERS;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        validateSize(numbers);
        validateDuplicate(numbers);
    }

    private void validateDuplicate(List<Integer> numbers) {
        if (numbers.size() != numbers.stream().distinct().count()){
            throw new IllegalArgumentException(IS_DUPLICATE);
        }
    }

    private void validateSize(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException(NOT_SIX_NUMBERS);
        }
    }


    public List<Integer> getNumbers() {
        return numbers;
    }
}
