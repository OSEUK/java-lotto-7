package lotto.service;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;
import lotto.repository.LottoRepository;

import java.util.List;

public class PurchaseService {
    private static final int LIMIT_MIN_NUMBER = 1;
    private static final int LIMIT_MAX_NUMBER = 45;
    static final int PICK_COUNT = 6;

    private final LottoRepository lottoRepository;

    public PurchaseService(LottoRepository lottoRepository) {
        this.lottoRepository = lottoRepository;
    }

    public void purchaseLotto(int amount){
        for (int i = 0; i < amount ; i++){
            lottoRepository.save(makeNewLotto());
        }
    }

    private Lotto makeNewLotto() {
        while (true) {
            try {
                List<Integer> numbers = getRandomNumber();
                return new Lotto(numbers);
            } catch (IllegalArgumentException e) {
            }
        }
    }

    private List<Integer> getRandomNumber(){
        return Randoms.pickUniqueNumbersInRange(LIMIT_MIN_NUMBER, LIMIT_MAX_NUMBER, PICK_COUNT);
    }

}
