package Adapter;

import java.util.ArrayList;
import java.util.List;

public class Adapt {
    public interface IStorage {
        void append(String s);
    }
    public static class Log {
        protected final IStorage storage;
        public Log(IStorage storage) { this.storage = storage; }
        public void log(String line) {
            storage.append(line);
        }
    }
    public static class ListStorageAdapter implements IStorage {
        protected List<String> list;
        public ListStorageAdapter(List<String> list) { this.list = list; }
        @Override
        public void append(String s) {
            list.add(s);
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Log logger = new Log(new ListStorageAdapter(list));
        logger.log("Hello!");
    }
}