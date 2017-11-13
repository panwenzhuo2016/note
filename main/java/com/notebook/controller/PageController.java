package com.notebook.controller;

import com.google.common.collect.Maps;
import com.notebook.po.Classify;
import com.notebook.service.IClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by pwz on 2017/11/13.
 */
@Controller
@RequestMapping("/")
public class PageController {

    @Autowired
    IClassifyService classifyService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String index(Model map) {
        map.addAttribute("name", "note ");
        return "page/note";
    }

    @RequestMapping(params = "get")
    @ResponseBody
    public Classify get(String id) {
        Classify classify = classifyService.get(id);
        return classify;
    }
    @RequestMapping(params = "getAllClassify")
    @ResponseBody
    public List<Classify> getAllClassify() {
        Map<String, Object> params = Maps.newHashMap();
        List<Classify> classifyList = classifyService.findDataGrid(params);
        return classifyList;
    }

    @RequestMapping(params = "add")
    @ResponseBody
    public Classify add(Classify classify) {
        classifyService.add(classify);
        return classify;
    }
}
