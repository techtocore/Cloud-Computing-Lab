FROM tomcat:9.0.1-jre8-alpine

RUN cd /usr/local/tomcat/webapps

RUN mkdir -pv /usr/local/tomcat/webapps/webapptest

RUN cd /usr/local/tomcat/webapps/webapptest

RUN touch /usr/local/tomcat/webapps/webapptest/index.jsp

RUN echo "Work agudhu da :( " >> /usr/local/tomcat/webapps/webapptest/index.jsp

RUN mkdir /usr/local/tomcat/webapps/webapptest/WEB-INF/

RUN cd /usr/local/tomcat/webapps/webapptest/WEB-INF

RUN mkdir /usr/local/tomcat/webapps/webapptest/WEB-INF/classes

RUN mkdir /usr/local/tomcat/webapps/webapptest/WEB-INF/lib

RUN touch /usr/local/tomcat/webapps/webapptest/WEB-INF/web.xml

RUN echo "<web-app> </web-app>" >> /usr/local/tomcat/webapps/webapptest/WEB-INF/web.xml

RUN cd /usr/local/tomcat/webapps

CMD ["catalina.sh", "run"]
