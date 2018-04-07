package com.example.demo.Service;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.News;
import com.example.demo.Repository.NewsRepository;


@Service
public class NewsService {
	@Autowired
	NewsRepository repository;
	private static final Logger log = LoggerFactory.getLogger(NewsService.class);
	
	public News getNews(int newsId) {
		News news = null;
		Optional<News> optional = repository.findById(newsId);
		news = optional.get();
		return news;
	}
	
	public boolean saveNews(News news) {
		if (news.content==null) {
			log.info("新闻未添加信息");
			return false;
		}
		Calendar calendar =  Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		news.setNews_time(calendar.getTime().toString());
		repository.save(news);
		log.debug("数据已成功保存"+news);
		return true;
	}
	public boolean UpdateNews(News news) {
		if (news.content==null) {
			log.info("新闻未添加信息");
			return false;
		}
		Calendar calendar =  Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		repository.save(news);
		return true;
	}
	public boolean deleteNewsbyId(int news_id) {
		if (!repository.existsById(news_id)) {
			log.debug("删除失败，不存在该项记录");
			return false;
		}
		repository.deleteById(news_id);
		return true;
	}
	public List<News> getAllNews() {
		List<News> list=null;
		list = (List<News>) repository.findAll();
		return list;
	}
}
