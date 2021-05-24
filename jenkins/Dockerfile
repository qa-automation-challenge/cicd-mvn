FROM maven:3-alpine

ENV SONAR_RUNNER_HOME=sonar-scanner
ENV PATH=$PATH:/sonar-scanner/bin
ENV SONAR_BINARY=sonar-scanner-cli-3.3.0.1492
ENV SONAR_URL=https://binaries.sonarsource.com/Distribution/sonar-scanner-cli/${SONAR_BINARY}.zip
ENV CHECKSTYLE_URL=https://github.com/checkstyle/checkstyle/releases/download/checkstyle-8.41/checkstyle-8.41-all.jar

RUN apk -U add git \
  && curl -s -L $SONAR_URL -o sonarscanner.zip \
  && unzip -qq sonarscanner.zip \
  && rm -rf sonarscanner.zip \
  && mv sonar-scanner-3.3.0.1492 sonar-scanner \
  && sed -i 's/use_embedded_jre=true/use_embedded_jre=false/g' /sonar-scanner/bin/sonar-scanner \
  && curl -s -L $CHECKSTYLE_URL -o checkstyle.jar \
  && mkdir -p /checkstyle/ \
  && mv checkstyle.jar /checkstyle/checkstyle.jar