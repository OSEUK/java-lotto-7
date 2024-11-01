package lotto.repository;

import lotto.domain.Lotto;

import java.util.ArrayList;
import java.util.List;

public class LottoRepositoryImpl implements LottoRepository{
    private final List<Lotto> purchasedLottos = new ArrayList<>();

    @Override
    public void save(Lotto lotto) {
        purchasedLottos.add(lotto);
    }

    @Override
    public List<Lotto> findAll() {
        return purchasedLottos;
    }

    @Override
    public int getAmount() {
        return purchasedLottos.size();
    }
}
