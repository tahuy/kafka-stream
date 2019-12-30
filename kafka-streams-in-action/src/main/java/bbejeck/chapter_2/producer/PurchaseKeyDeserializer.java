package bbejeck.chapter_2.producer;
import java.util.Map;
import org.apache.kafka.common.serialization.Deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;

import bbejeck.model.PurchaseKey;

public class PurchaseKeyDeserializer implements Deserializer<PurchaseKey> {

	  @Override public void close() {

	  }

	  @Override public void configure(Map<String, ?> map, boolean b) {

	  }

	  @Override
	  public PurchaseKey deserialize(String topic, byte[] data) {
	    ObjectMapper mapper = new ObjectMapper();
	    PurchaseKey user = null;
	    try {
	      user = mapper.readValue(data, PurchaseKey.class);
	    } catch (Exception e) {

	      e.printStackTrace();
	    }
	    return user;
	  }

	}