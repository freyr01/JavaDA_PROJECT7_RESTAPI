package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnk.springboot.domain.Trade;
import com.nnk.springboot.repositories.TradeRepository;

@Service
public class TradeServiceImpl implements ITradeService {

	private TradeRepository tradeRepository;
	
	@Autowired
	public TradeServiceImpl(TradeRepository p_tradeRepository) {
		tradeRepository = p_tradeRepository;
	}
	
	@Override
	public Trade save(Trade trade) {
		return tradeRepository.save(trade);
	}

	@Override
	public List<Trade> findAll() {
		return tradeRepository.findAll();
	}

	@Override
	public Trade findById(Integer id) {
		Optional<Trade> trade = tradeRepository.findById(id);
		if(trade.isPresent()) {
			return trade.get();
		}
		return null;
	}

	@Override
	public void delete(Integer id) {
		Trade trade = findById(id);
		if(trade != null) {
			tradeRepository.delete(trade);
		}

	}

}
