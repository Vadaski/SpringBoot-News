package com.example.demo.Controller;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.example.demo.Model.News;
import com.example.demo.Service.NewsService;



@RestController
@RequestMapping("/news")
public class NewsController {
	@Autowired
	NewsService newsService;
	private static final Logger log = LoggerFactory.getLogger(NewsController.class);
	
	@GetMapping(path = "{id}")
	public News getNewsById(@PathVariable("id")int id) {
		log.info("正在查询id = "+id+"的news");
		return newsService.getNews(id);
	}
	
	@PostMapping()
	public boolean saveNews(@RequestBody News news) {
		if (news == null) {
			log.info("添加失败");
			return false;
		}
		newsService.saveNews(news);
		log.info("添加成功");
		return true;
	}
	
	@DeleteMapping(path = "/{id}")
	public boolean deleteNews(@PathVariable("id")int id) {
		if (newsService.deleteNewsbyId(id)) {
			log.info("成功删除id为"+id+"的news");
			return true;
		}
		log.info("删除失败");
		return false;
	}
	
	@PutMapping
	public boolean insert(@RequestBody News news) {
		log.debug("正在修改id为"+news.getNews_id()+"的news");
		if (newsService.UpdateNews(news)) {
			log.info("成功修改id为 "+news.getNews_id()+"的新闻");
			return true;
		}
			log.debug("修改失败");
		return false;
	}
	@GetMapping()
	public List<News> getAllNews(){
		log.info("正在获取全部新闻");
		return newsService.getAllNews();
	}
}
