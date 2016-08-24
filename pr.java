
import java.io.*;
class Edge
{
int v1,v2,wt;
}
class kruskalsalgo
{
public static void main(String args[])throws IOException
{
int ik,j,mincost=0;
BufferedReader br=new BufferedReader( new InputStreamReader(System.in));
System.out.println(" Enter no.of vertices:");
int v=Integer.parseInt(br.readLine());
System.out.println(" Enter no.of edges:");
int e=Integer.parseInt(br.readLine());
Edge ed[]=new Edge[e+1];
for(ik=1;ik<=e;ik++)
{
ed[ik]=new Edge();
System.out.println(" Enter the vertices and the weight of edge "+(ik)+ ":");
ed[ik].v1=Integer.parseInt(br.readLine());
ed[ik].v2=Integer.parseInt(br.readLine());
ed[ik].wt=Integer.parseInt(br.readLine());
}
for(ik=1;ik<=e;ik++)
for(j=1;j<=e-1;j++)
{
if(ed[j].wt>ed[j+1].wt)
{
Edge t=new Edge();
t=ed[j];
ed[j]=ed[j+1];
ed[j+1]=t;
}
}
int visited[]=new int[v+1];
for(ik=1;ik<=v;ik++)
visited[ik]=0;
System.out.println("MINIMUM SPANNING TREE :");
for(ik=1;ik<=e;ik++)
{
if(ik>v)
break;
else if( visited[ed[ik].v1]==0 || visited[ed[ik].v2]==0)
{
System.out.println(ed[ik].v1+ "-"+ ed[ik].v2);
visited[ed[ik].v1]=visited[ed[ik].v2]=1;
mincost+=ed[ik].wt;
}
}
System.out.println("MINIMUM COST = " +mincost);
}
}
