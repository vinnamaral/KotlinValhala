package aus.vinnamaral.kotlin.unlearnoop

import aus.vinnamaral.kotlin.outcome.Outcome


fun processAll(contracts: List<Contract>):
        Outcome<ContractError, List<Pair<ContractId, ProcessResult>>> =

    TODO("some code here")





typealias ContractsResult = List<Pair<ContractId, ProcessResult>>
typealias ContractsOutcome = Outcome<ContractError, ContractsResult>

fun processContracts(contracts: List<Contract>): ContractsOutcome =

    TODO("some code here")