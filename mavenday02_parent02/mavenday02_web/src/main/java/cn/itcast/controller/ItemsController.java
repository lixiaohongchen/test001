package cn.itcast.controller;

import cn.itcast.domain.Items;
import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    @Qualifier("itemsService")
    private ItemsService itemsService;

    @RequestMapping("/findOne")
    public String findOne(Model model){
        Items items = itemsService.findOne(1);
        model.addAttribute("item",items);
        return "itemDetail";
    }
}
