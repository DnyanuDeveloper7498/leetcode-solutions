class MyHashMap {

    int map[];
    int seen[];
    int version=1;

    public MyHashMap() 
    {
      map=new int [1000001];
      seen=new int [1000001];    
    }
    
    public void put(int key, int value) {
        map[key]=value;
        seen[key]=version;
    }
    
    public int get(int key) {
        return seen[key]==version?map[key]:-1;
    }
    
    public void remove(int key) {
        seen[key]=0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */