package dev.java10x.CadastroDeNinjas.Ninjas;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é a minha primeira mensagem nessa rota.";
    }
}
