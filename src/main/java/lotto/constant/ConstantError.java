package lotto.constant;

public class ConstantError {
    private static final String ERROR = "[ERROR] ";
    public static final String NOT_NUMBER = ERROR + "숫자가 아닙니다.";
    public static final String NOT_DIVISIBLE = ERROR + "구매 금액은 1,000 원으로 나누어 떨어져야 합니다.";
    public static final String NOT_SIX_NUMBERS = ERROR + "로또 번호는 6개여야 합니다.";
    public static final String IS_NULL = ERROR + "입력 숫자는 NULL일 수 없습니다.";
    public static final String IS_DUPLICATE = ERROR + "중복 숫자가 입력될 수 없습니다.";
}
