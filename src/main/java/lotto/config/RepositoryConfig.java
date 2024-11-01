package lotto.config;

import lotto.repository.LottoRepository;
import lotto.repository.LottoRepositoryImpl;

public class RepositoryConfig {
    private static final LottoRepository lottoRepository = new LottoRepositoryImpl();

    public static LottoRepository getLottoRepository(){
        return lottoRepository;
    }
}
