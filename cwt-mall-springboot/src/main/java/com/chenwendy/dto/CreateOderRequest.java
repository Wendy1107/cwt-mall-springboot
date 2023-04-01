package com.chenwendy.dto;

import javax.validation.constraints.NotEmpty;
import java.util.List;

public class CreateOderRequest {

    @NotEmpty
    private List<BuyItem> buyItemList;

    public List<BuyItem> getBuyItemList() {
        return buyItemList;
    }

    public void setBuyItemList(List<BuyItem> buyItemList) {
        this.buyItemList = buyItemList;
    }
}
