#-----------------------------------------------------------------------------Importações
import NP

#-----------------------------------------------------------------------------Baralho
nipes = ['COPAS','PAUS','ESPADAS','OUROS','CORINGA']
valor = [' A',' J',' Q',' K',' 2',' 3',' 4',' 5',' 6',' 7',' 8',' 9',' 10']
#-----------------------------------------------------------------------------inicio
jogador = NP.nomeJogador()
#-----------------------------------------------------------------------------menu
NP.printMenu() #print do menu
menu = 'ON'
escolhaMenu = NP.tratamentoMenu()
#-----------------------------------------------------------------------------Inicio do menu principal
while menu == 'ON':
    #----------------------------------------opção de saida
    if escolhaMenu == '4':
        menu = 'OFF'
    #----------------------------------------regras do jogo
    elif escolhaMenu == '2':
        NP.regras()
        espera = input(' Press ENTER para CONTINUAR...')
    #----------------------------------------mudança de nome do jogador
    elif escolhaMenu == '3':
        jogador = NP.nomeJogador()
        espera = input('Mudança feita!\nPress ENTER para CONTINUAR...')
    #---------------------------------------inicio do jogo    
    else:
        NP.cabecalho('Par ou Impar')
        print('Vamos ver quem começa jogando!')
        NP.miniMenu('1 - Par')
        NP.miniMenu('2 - Impar')
        print(jogador[0]+' ',end='')
        parImpar = NP.tratamentodeErro2()
        #------------------------------------------------jogo do par ou impar
        NP.printParImpar(parImpar,jogador)
        randPI = NP.par_impar()
        if(str(randPI) == parImpar):
            sequencia = 1
        else:
            sequencia = 2
        espera = input(' press ENTER para continuar...')
        if(sequencia == 1):
            print('\nQuem começa é: '+jogador[0])
        else:
            print('\nQuem começa é: '+jogador[1])
        espera = input(' press ENTER para continuar...')
        game = 'ON'
        pontoGeral = [0,0]
        partidas = 7
        pontoGeral = NP.rodaJogo(nipes,valor,jogador,sequencia,game,pontoGeral)
 
        if(pontoGeral[0]>pontoGeral[1]):
            NP.cabecalho('\o/ Oo ;^) :^) XD =D '+jogador[0]+' \o/ Oo ;^) :^) XD =D')
        else:
            NP.cabecalho('\o/ Oo ;^) :^) XD =D '+jogador[1]+' \o/ Oo ;^) :^) XD =D')
        print('\n\nA pontuação foi: \n'+jogador[0]+' com',pontoGeral[0],'X',jogador[1]+' com',pontoGeral[1])
    NP.printMenu()
    escolhaMenu = NP.tratamentoMenu()

            

            
