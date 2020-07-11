package com.nt.atps.tiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class TilesConfiguration {
	public TilesConfiguration() {
		System.out.println("TilesConfiguration.TilesConfiguration()");
	}

	@Bean
	public UrlBasedViewResolver tilesViewResolver() {
		UrlBasedViewResolver ubvr = new UrlBasedViewResolver();
		ubvr.setViewClass(TilesView.class);
		return ubvr;
	}

	@Bean
	public TilesConfigurer tilesConfigurer() {
		TilesConfigurer tc = new TilesConfigurer();
		String defs[] = {"/WEB-INF/tiles.xml" };
		tc.setDefinitions(defs);
		return tc;
	}
}
