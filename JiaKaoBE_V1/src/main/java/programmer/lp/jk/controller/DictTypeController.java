package programmer.lp.jk.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import programmer.lp.jk.pojo.po.DictType;
import programmer.lp.jk.pojo.query.DictTypeQuery;
import programmer.lp.jk.service.DictTypeService;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/dictTypes")
public class DictTypeController {
    @Autowired
    private DictTypeService service;

    @GetMapping("/list")
    public Map<String, Object> list(DictTypeQuery query) {
        final Map<String, Object> map = new HashMap<>();
        final IPage<DictType> list = service.list(query);
        map.put("msg", "");
        map.put("data", list.getRecords());
        map.put("count", list.getTotal());
        map.put("code", 0);
        return map;
    }

    @PostMapping("/remove")
    public Map<String, Object> remove(String id) {
        // id = "10"
        // id = "1, 20, 23"
        final String[] ids = id.split(",");
        final Map<String, Object> map = new HashMap<>();
        if (service.removeByIds(Arrays.asList(ids))) {
            map.put("msg", "删除成功");
            map.put("code", 0);
        } else {
            map.put("msg", "删除失败");
            map.put("code", 1);
        }
        return map;
    }

    @PostMapping("/save")
    public Map<String, Object> save(DictType dictType) {
        final Map<String, Object> map = new HashMap<>();
        if (service.saveOrUpdate(dictType)) {
            map.put("msg", "保存成功");
            map.put("code", 0);
        } else {
            map.put("msg", "保存失败");
            map.put("code", 1);
        }
        return map;
    }
}

