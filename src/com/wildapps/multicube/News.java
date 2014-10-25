package com.wildapps.multicube;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import com.wildapps.multicube.R;
import com.wildapps.spleefleague.domain.Article;
import com.wildapps.spleefleague.parser.RssHandler;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class News  extends Activity {
	public String newsname1,newsname2,newsname3,newsname4,newsname5,newsname6,newsname7,newsname8,newsname9, news1 , news2 , news3 , news4, news5, news6 , news7 , news8, news9;
	public TextView newsitem1, newsitem2,newsitem3,newsitem4,newsitem5 ,newsitem6,newsitem7,newsitem8,newsitem9;
	public List<Article> articles;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.news);
		pull();
	}
	public void pull()
	{

		new Thread(new Runnable() {

			public void run() {
	        	String feed = "http://www.multicu.be/forums/news.2/index.rss";
	        	URL url = null;
	        	try {
	        	 
		        	SAXParserFactory spf = SAXParserFactory.newInstance();
		        	SAXParser sp = spf.newSAXParser();
		        	XMLReader xr = sp.getXMLReader();
		        	 
		        	url = new URL(feed);
		        	RssHandler rh = new RssHandler();
		        	 
		        	xr.setContentHandler(rh);
		        	xr.parse(new InputSource(url.openStream()));
		        	
		        	Log.e("ASYNC", "PARSING FINISHED");
		        	articles = rh.getArticleList();

		        	newsname1 = articles.get(0).getTitle().toString();
		        	newsname2 = articles.get(1).getTitle().toString();
		        	newsname3 = articles.get(2).getTitle().toString();
		        	newsname4 = articles.get(3).getTitle().toString();
		        	newsname5 = articles.get(4).getTitle().toString();
		        	newsname6 = articles.get(5).getTitle().toString();
		        	newsname7 = articles.get(6).getTitle().toString();
		        	newsname8 = articles.get(7).getTitle().toString();
		        	newsname9 = articles.get(8).getTitle().toString();
		        	
		        	news1 = newsname1;
		        	news2 = newsname2;
		        	news3 = newsname3;
		        	news4 = newsname4;
		        	news5 = newsname5;
		        	news6 = newsname6;
		        	news7 = newsname7;
		        	news8 = newsname8;
		        	news9 = newsname9;
		        	
		        	newsitem1 = (TextView)findViewById(R.id.Newsitem1);
		        	newsitem1.post(new Runnable() {
		                public void run() {
		                	newsitem1.setText(news1);
		                	newsitem1.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(0).getlink().toString(),news1);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	newsitem2= (TextView)findViewById(R.id.Newsitem2);
		        	newsitem2.post(new Runnable() {
		                public void run() {
		                	newsitem2.setText(news2);
		                	newsitem2.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(1).getlink().toString(),news2);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	newsitem3 = (TextView)findViewById(R.id.Newsitem3);
		        	newsitem3.post(new Runnable() {
		                public void run() {
		                	newsitem3.setText(news3);
		                	newsitem3.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(2).getlink().toString(),news3);
		            					
		            			}
		            		});
		                }
		              });
		        	newsitem4 = (TextView)findViewById(R.id.Newsitem4);
		        	newsitem4.post(new Runnable() {
		                public void run() {
		                	newsitem4.setText(news4);
		                	newsitem4.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(3).getlink().toString(),news4);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	newsitem5 = (TextView)findViewById(R.id.Newsitem5);
		        	newsitem5.post(new Runnable() {
		                public void run() {
		                	newsitem5.setText(news5);
		                	newsitem5.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(4).getlink().toString(),news5);
		            					
		            			}
		            		});
		                }
		              });
		        	newsitem6= (TextView)findViewById(R.id.Newsitem6);
		        	newsitem6.post(new Runnable() {
		                public void run() {
		                	newsitem6.setText(news6);
		                	newsitem6.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(5).getlink().toString(),news6);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	newsitem7 = (TextView)findViewById(R.id.Newsitem7);
		        	newsitem7.post(new Runnable() {
		                public void run() {
		                	newsitem7.setText(news7);
		                	newsitem7.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(6).getlink().toString(),news7);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	newsitem8 = (TextView)findViewById(R.id.Newsitem8);
		        	newsitem8.post(new Runnable() {
		                public void run() {
		                	newsitem8.setText(news8);
		                	newsitem8.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(7).getlink().toString(),news8);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	newsitem9 = (TextView)findViewById(R.id.Newsitem9);
		        	newsitem9.post(new Runnable() {
		                public void run() {
		                	newsitem9.setText(news9);
		                	newsitem9.setOnClickListener(new View.OnClickListener() {
		            			
		            			@Override
		            			public void onClick(View v) {
		            				Webview(articles.get(8).getlink().toString(),news9);
		            					
		            			}
		            		});
		                	
		                }
		              });
		        	
		        	  		
		        			
				} catch (IOException e) {
					Log.e("RSS Handler IO", e.getMessage() + " >> " + e.toString());
				} catch (SAXException e) {
					Log.e("RSS Handler SAX", e.toString());
					e.printStackTrace();
				} catch (ParserConfigurationException e) {
					Log.e("RSS Handler Parser Config", e.toString());
				}
	        }   
	    }).start();
		
	}
	
	public void Webview(String url , String title)
	{
		AlertDialog.Builder alert = new AlertDialog.Builder(this);

        alert.setTitle(title);
        WebView wv = new WebView(this);

        wv.loadUrl(url);
        wv.getSettings().setJavaScriptEnabled(true);   
		wv.getSettings().setSupportZoom(true);       //Zoom Control on web (You don't need this 
			//if ROM supports Multi-Touch      
		wv.getSettings().setBuiltInZoomControls(true);
        wv.setWebViewClient(new WebViewClient()
        {
            public boolean shouldOverrideUrlLoading(WebView view, String url)
            {
                view.loadUrl(url);

                return true;
            }
        });

        alert.setView(wv);
        alert.setNegativeButton("Close", new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int id)
            {
            }
        });
        alert.show();
	}

}