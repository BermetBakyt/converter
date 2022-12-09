package com.test.converter.presentation.select

//@AndroidEntryPoint
//class SelectCurrencyFragment (
//    ): BaseFragment<SelectViewModel, FragmentSelectBinding>(
//    R.layout.fragment_select
//) {
//
//    override val binding by viewBinding(FragmentSelectBinding::bind)
//    override val viewModel: SelectViewModel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding.btnConvert.setOnClickListener {
//            viewModel.convert(
//                binding.etFrom.text.toString(),
//                binding.spToCurrency.selectedItem.toString(),
//                binding.spFromCurrency.selectedItem.toString(),
//            )
//        }
//
//        lifecycleScope.launchWhenStarted {
//            viewModel.conversion.collect { event ->
//                when(event) {
//                    is SelectViewModel.CurrencyEvent.Success -> {
//                        binding.progressBar.isVisible = false
//                        binding.tvResult.setTextColor(Color.BLACK)
//                        binding.tvResult.text = event.resultText
//                    }
//                    is SelectViewModel.CurrencyEvent.Failure -> {
//                        binding.progressBar.isVisible = false
//                        binding.tvResult.setTextColor(Color.RED)
//                        binding.tvResult.text = event.errorText
//
//                    }
//                    is SelectViewModel.CurrencyEvent.Loading -> {
//                        binding.progressBar.isVisible = true
//                    }
//                    else -> Unit
//                }
//
//            }
//        }
//    }
//}