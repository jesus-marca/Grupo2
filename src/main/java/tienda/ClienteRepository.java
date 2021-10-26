package tienda;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.FindOneAndReplaceOptions;

import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.Document;
import org.bson.codecs.configuration.CodecRegistries;

public class ClienteRepository {

    private final MongoClient mongoClient;
    private MongoCollection<Pedido> pedidos;
    private MongoCollection<Cliente> clientes;

    public ClienteRepository() {
        this.mongoClient = new MongoClient("localhost", 27017);
        this.getDatabase();
    }
    public MongoDatabase getDatabase() {
        CodecRegistry pojoCodecRegistry = CodecRegistries.fromRegistries(
                MongoClientSettings.getDefaultCodecRegistry(),
                CodecRegistries.fromProviders(
                        PojoCodecProvider.builder().automatic(true).build()
                )
        );
        MongoDatabase database = this.mongoClient.getDatabase("SRP").withCodecRegistry(pojoCodecRegistry);

        this.pedidos = database.getCollection("pedidos", Pedido.class);
        this.clientes = database.getCollection("clientes", Cliente.class);
        
        return database;
    }

    public Object crearCliente(String numeroDocumento) {

        Cliente cliente = new Cliente(numeroDocumento);
        clientes.insertOne(cliente);
        return cliente;
    }
}
