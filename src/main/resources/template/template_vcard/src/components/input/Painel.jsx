import Contas from './Contas';
import '/src/components/input/painel.css'

function Painel({text}) {
    return (
        <>
            <div className="container-painel">
                <div className="content-painel">
                    <h2>Contas</h2>
                    <div className='layout-tipo'>
                        <button>Organizador</button>
                        <button>Participante</button>
                        <button>Visitante</button>
                    </div>
                    <div className='painel-layout'>
                        <Contas/>
                    </div>
                </div>
            </div>
        </>
    )
}

export default Painel;