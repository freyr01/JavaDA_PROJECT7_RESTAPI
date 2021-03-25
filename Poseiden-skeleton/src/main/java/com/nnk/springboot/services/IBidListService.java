package com.nnk.springboot.services;

import java.util.List;
import java.util.Optional;

import com.nnk.springboot.domain.BidList;

public interface IBidListService {

	public List<BidList> list();

	public BidList add(BidList bid);

	public Optional<BidList> get(Integer id);
}
