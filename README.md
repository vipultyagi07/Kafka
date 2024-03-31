# Kafka commands

zookeeper-server-start.bat ..\..\config\zookeeper.properties 

kafka-server-start.bat ..\..\config\server.properties

kafka-topics.bat --create --topic my-topic --bootstrap-server localhost:9092 --replication-factor 1 --partitions 3

## To see the topic 

kafka-topics.bat --describe --topic my-topic --bootstrap-server localhost:9092

## To create the topic

kafka-console-producer.bat --topic my-topic --bootstrap-server localhost:9092

## To fill the data 
kafka-console-producer.bat --broker-list localhost:9092 --topic my-topic
## I/P
>message1
>message2
>message3
#

## For viewing messages from the beginning

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic --from-beginning
## O/P
>message1
>message2
>message3

# For viewing the latest message after running this command in the terminal

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic my-topic
# O/P
>message3
