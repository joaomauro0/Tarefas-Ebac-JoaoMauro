public class PrimeiraClasse {

    public static void main(String args[]){

        Banda banda = new Banda();
        banda.setNomeBanda("Artic Monkeys");
        System.out.println(banda.getnomeBanda());
        System.out.print("Quantidade de Integrantes ");
        banda.setQuantidadeIntegrantes(4);
        System.out.println(banda.getquantidadeIntegrantes());
        banda.setnomeIntegrantes("nome integrantes: Alex Turner, Jamie Cook, Nick O'Malley and Matt Helders");
        System.out.println(banda.getNomeIntegrantes());


        Album album = new Album();
        Album album2 = new Album();
        Album album3 = new Album();
            album.setDataLancamento(2013);
            album2.setDataLancamento(2022);
            album3.setDataLancamento(2007);
            album.setNomeAlbum("AM-");
            album2.setNomeAlbum(" The Car- ");
            album3.setNomeAlbum("Favourite Worst Nightmare-");
                System.out.print("Nome dos Albuns e data lancamento:");
                System.out.print (album.getNomeAlbum());
                System.out.println (album.getDataLancamento());
                System.out.print(album2.getNomeAlbum());
                System.out.println (album2.getDataLancamento());
                System.out.print(album3.getNomeAlbum());
                System.out.print (album3.getDataLancamento());




    }


}